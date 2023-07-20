package cl.uchile.dcc
package gwent.cards

import gwent.field.Field
import gwent.players.IPlayer

/** Interface to be implemented by the cards giving them a name.*/
trait ICard {

  /** If it is a Weather Card or one of the different types of Unit Cards.
   *  This serves to know where a Card will be placed on the field. */
  val classification: String

  /** Gets the name of the card.*/
  def name: String

/** Cards can be played on the field.
 *  When a card is played, the field will update
 *  in the zone corresponding to the classification of this card
 *  and apply the corresponding effect in case of having.
 *
 *  @param player The player whose zone the card is going to be placed in.
 *  @param field The field in which the game is developed. */
  def toField(player: IPlayer, field: Field): Unit
}