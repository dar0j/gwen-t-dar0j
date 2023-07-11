package cl.uchile.dcc
package gwent.cards.classes.effects

/**Interface to be implemented by some unit cards granting them an effect.*/
trait IEffect {
  /** The varying effect. */
  def effect(): Unit
}
