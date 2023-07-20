package cl.uchile.dcc
package gwent.players

import gwent.cards.ICard
import gwent.cards.classes.units.{CloseCombat, Ranged, Siege}
import gwent.field.zones.Zone
import gwent.field.Field

/** Interface that indicates the attributes and methods a player has. */
trait IPlayer {

  /** Gems represent the life of a player.
   *  When they reach 0, it is game over for the player.
   *  Players lose 1 gem when a round ends and
   *  they have less or the same accumulated force on the field.
   *  Protected variable so it cannot be modified from the outside. */
  def gems: Int

  /** The Deck of 25 cards each player has.
   *  From here they will draw cards to their hand.
   *  Protected variable so it cannot be modified from the outside. */
  def deck: List[ICard]

  /** The Hand of 10 cards each player will draw at the start of the game.
   * From here they will play cards to the field.
   * Protected variable so it cannot be modified from the outside. */
  def hand: List[ICard]

  /** The Close Combat Zone of this player. */
  protected var closeCombatZone: Zone[CloseCombat]

  /** The Ranged Zone of this player. */
  protected var rangedZone: Zone[Ranged]

  /** The Siege Zone of this player. */
  protected var siegeZone: Zone[Siege]

  /** Gets the name of the player, in the future may be requested as input. */
  def name: String

  /** Plays a card placing it from the hand to the field.
   *  Cards cannot be played if there's already 10 cards in the corresponding zone.
   *  This method will tell the card to place itself on the field and then,
   *  knowing the type of the card and who's playing, that call will resolve in
   *  calling a method from here described later of which zone to place the card on.
   *
   *  @param index Index of the card to be played from the hand.
   *  @param field The field in which the game develops. */
  def playCard(index: Int, field: Field): Unit

  /** Draws a certain number of cards from the deck to the hand and shuffles the Deck.
   *
   *  @param howMany How many cards the player draws. */
  def drawCards(howMany: Int): Unit

  /** Adds the card to the Siege Zone of this player and updates the field accordingly.
   *
   *  @param siege A Siege Unit Card.
   *  @param field The field in which the game develops. */
  def updateSiegeZone(siege: Siege, field: Field): Unit

  /** Adds the card to the Ranged Zone of this player and updates the field accordingly.
   *
   *  @param ranged A Ranged Unit Card.
   *  @param field The field in which the game develops. */
  def updateRangedZone(ranged: Ranged, field: Field): Unit

  /** Adds the card to the Close Combat Zone of this player and updates the field accordingly.
   *
   *  @param closeCombat A Close Combat Unit Card.
   *  @param field The field in which the game develops. */
  def updateCloseCombatZone(closeCombat: CloseCombat, field: Field): Unit

  /** Shuffles the player's deck.
   *
   * The order of cards in the player's deck is randomized.
   * This is achieved by creating a new, shuffled list and reassigning _deck to it, rather
   * than by modifying the original list. */
  def shuffleDeck(): Unit

  def registerObserver(o: Observer[T]): Unit

  def notifyObservers(response: T)
}
