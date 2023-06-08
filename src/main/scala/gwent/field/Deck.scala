package cl.uchile.dcc
package gwent.field

import gwent.cards.ICard
import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class Deck {
  private var D: ArrayBuffer[ICard] = new ArrayBuffer[ICard](25)
  def shuffle(): Unit = {
    D = Random.shuffle(D)
  }
}
