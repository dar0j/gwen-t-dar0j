package cl.uchile.dcc
package gwent

/** The computer in the game playing against a player.
 *
 * @constructor Initializes the gems and name "COM".
 */
class Computer extends Player{
  private val name: String = "COM"
  var gems: Int = 2
  var D: Deck = List(new Units("a", 1), new Units("b", 2), new Weather("c"))
  var H: Hand = List(new Units("d", 3), new Units("e", 4), new Weather("f"))

}