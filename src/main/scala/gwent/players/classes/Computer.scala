package cl.uchile.dcc
package gwent.players.classes

import cl.uchile.dcc.gwent.players.AbstractPlayer

import scala.collection.mutable.ListBuffer

/** The computer in the game playing against a player.
 *
 * @constructor Initializes the gems and name "COM".
 */
class Computer extends AbstractPlayer {
  private val name: String = "COM"
  var Deck: ListBuffer = ListBuffer(new Units("a", 1), new Units("b", 2), new Weather("c"))
  var Hand: ListBuffer = ListBuffer(new Units("d", 3), new Units("e", 4), new Weather("f"))

}