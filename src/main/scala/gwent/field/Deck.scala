package cl.uchile.dcc
package gwent

import cl.uchile.dcc.cards.ICard
import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class Deck {
  val D: ArrayBuffer[ICard] = new ArrayBuffer[ICard](25)
  def shuffle():
    val D: ArrayBuffer[ICard] = Random.shuffle(D)
}
