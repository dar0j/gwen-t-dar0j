package cl.uchile.dcc
package gwent

trait Jugador{
  private val nombre: str
  var Gemas: int = 2

  def jugarCarta(): Unit
  def robarCarta(): Unit
}
class Computadora extends Jugador{
  private val nombre: str = "COM"
  var Gemas: int = 2

  def jugarCarta():
  pass

  def robarCarta():
  pass
}
