package cl.uchile.dcc
package gwent.field.zones

import gwent.cards.classes.AbstractUnit

import cl.uchile.dcc.gwent.cards.ICard

import scala.collection.mutable.ArrayBuffer

class Zone[T<:ICard]()
  extends IZone {
  private val cardZone: ArrayBuffer[T] = new ArrayBuffer[T](10)

  def get(i: Int): T = {
    cardZone(i)
  }
  def add(t: T): Unit = {
    cardZone += t
  }
  def delete(t: T): Unit = {
    if (t in cardZone) {
      cardZone -= t
    }
  //  else throw exception
  }
}
