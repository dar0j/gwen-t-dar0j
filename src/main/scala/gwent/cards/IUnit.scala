package cl.uchile.dcc
package gwent.cards

/** Unit type of cards have to implement this interface. */
trait IUnit
  extends ICard {

  /** Gets the strength each Unit has. */
  def force: Int

  /** Some Unit Cards have an effect,
   *  the ones who don't have it will still have the effect of doing nothing
   *  so this will be modeled with the Null Object Pattern. */
  val effect: String
}
