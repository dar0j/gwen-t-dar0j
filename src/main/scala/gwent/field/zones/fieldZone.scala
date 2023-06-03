package cl.uchile.dcc
package gwent.field.zones

import gwent.cards.classes.AbstractUnit

import scala.Console.in
import scala.collection.mutable.ArrayBuffer

class fieldZone[T<:AbstractUnit]() {
  private val unitZone: ArrayBuffer[T] = new ArrayBuffer[T](10)

  def get(i: Int): T = {
    unitZone(i)
  }
  def add(t: T): Unit = {
    unitZone += t
  }
  def delete(t: T): Unit = {
    if (t in unitZone) {
      unitZone -= t
    }
  //  else throw exception
  }
}
