package cl.uchile.dcc
package gwent

/** The player in the game playing against the computer.
 *
 * @param playername
 * @constructor Creates an user with playername as his name, also initializes the gems.
 */
class User(playername: String) extends Player{
  private val name: String = playername
  var gems: Int = 2
  var D: Deck = List(new Units("a", 1), new Units("b", 2), new Weather("c"))
  var H: Hand = List(new Units("d", 3), new Units("e", 4), new Weather("f"))
}

