package cl.uchile.dcc
package gwent

import cl.uchile.dcc.gwent.field.zones.Zone
import cl.uchile.dcc.gwent.players.IPlayer
import cl.uchile.dcc.gwent.players.classes.{Computer, User}

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class GameController(val userInterface: UserInterface) {

  /** List of PlayerCharacter instances participating in the game.
   * Initially empty.
   */
  private var playerCharacters = List.empty[IPlayer]

  /** List of Computer instances participating in the game.
   * Initially empty.
   */
  private var PCs = List.empty[IPlayer]

  /** Queue to manage turns of the Playe instances.
   * Initially empty.
   */
  private val turnsQueue = mutable.Queue.empty[IPlayer]

  /** Current state of the game, initially set to an instance of IdleState. */
  var state: GameState = new IdleState(this)

  /** The currently selected Player, if any, used for game actions such as playing a card. */
  private var selection: Option[IPlayer] = None

  /** The current GameCharacter whose turn it is to perform an action. */
  private var currentCharacter: Option[IPlayer] = None

  /** Map representing the field of the game, with Zone names as keys and corresponding Zone instances as values. */
  private val field = mutable.Map.empty[String, Zone]

  /** A factory for creating Weather card instances. */
  private val weatherFactory = new WeatherFactory

  /** A factory for creating Close Combat Unit instances. */
  private val CCFactory = new CloseCombatFactory

  /** A factory for creating Range Unit instances. */
  private val RFactory = new RangeFactory

  /** A factory for creating Siege Unit instances. */
  private val SFactory = new SiegeFactory


  /** Starts a new game with the specified player characters and PC's.
   *
   * This method initializes the game by creating [[PlayerCharacter]] and [[PCs]]
   * instances for each name provided in the respective lists.
   * The state of the game is then set to [[IdleState]].
   * The input parameters are lists of strings rather than lists of characters.
   * This approach is designed to maintain the separation of concerns between the game's model and
   * its view, as per the Model-View-Controller (MVC) architectural pattern.
   * The view (which calls this method) does not need to be aware of the [[IPlayer]] trait or
   * its subclasses; it only needs to provide a list of names.
   * The [[GameController]] is then responsible for constructing the [[IPlayer]] objects
   * from these names.
   *
   * @param playerCharacters A list of names for the player characters to be added to the game.
   * @param PCs  A list of names for the enemy characters to be added to the game.
   */
  def startGame(
                 playerCharacters: List[String],
                 PCs: List[String]
               ): Unit = {
    playerCharacters.foreach(addPlayerCharacter)
    PCs.foreach(addPC)
    state = new IdleState(this)
    //pass turns
    if (playerCharacters(0).gems == 0) {
        notifyObservers(playerCharacters(0))
      }
    if (PCs(0).gems == 0) {
      notifyObservers(PCs(0))
    }
  }

  private def addToField[T <: Zone](factory: Zone[T], name: String): Unit = {
    factory.name = Some(name)
    val item = factory.createItem()
    field += (item -> item)
  }

  /** Adds a player character to the game.
   *
   * This method creates a new instance of [[PlayerCharacter]] with the provided `name` and adds it
   * to the list of `playerCharacters` in the game.
   *
   * @param name The name of the player character to be added to the game.
   */
  def addPlayerCharacter(name: String): Unit = {
    playerCharacters = playerCharacters :+ new User(name)
  }

  /** Adds a PC character to the game.
   *
   * This method creates a new instance of [[PC]] with the provided `name` and adds it
   * to the list of `PCs` in the game.
   */
  def addPC(): Unit = {
    PCs = PCs :+ new Computer()
  }

