package cl.uchile.dcc
package gwent.players.classes

import cl.uchile.dcc.gwent.players.AbstractPlayer

/** The player in the game playing against the computer.
 *
 * @param playername
 * @constructor Creates an user with playername as his name, also initializes a Deck and a Hand.
 */
class User(playername: String) extends AbstractPlayer {
  private val name: String = playername
  val deck: Deck = ArrayBuffer(new Units("a", 1), new Units("b", 2), new Weather("c"))
  val hand: Hand = List(new Units("d", 3), new Units("e", 4), new Weather("f"))
}

