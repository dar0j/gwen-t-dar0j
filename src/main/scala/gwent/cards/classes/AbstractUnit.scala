package cl.uchile.dcc
package gwent.cards.classes

import gwent.cards.IUnit
import gwent.cards.effects.{IEffect, NoEffect}

/** Creates the model of Unit Cards.
 *
 *  @param _name The name of the Unit card.
 *  @param _force The given strength of this Unit card, may be modified.
 *  @param effect The effect the Unit Card has, no effect by default .
 */
abstract class AbstractUnit(private val _name: String,
                            private var _force: Int,
                            private val effect: IEffect = NoEffect)
  extends IUnit {

  override def name: String = _name

  override def force: Int = _force

  /** Units' force may be modified by effects so here we have a setter to a new force.
   *  @param newForce The new resulting force of the Unit. */
  def force_=(newForce: Int): Unit = {
    _force = newForce
  }

  /** Applyes the effect of adding plus 1 to the force of all the other Units in the same Zone.
   *
   *  @return Unit, but changes the field. */
  def moraleBooster(): Unit = {
//    z = this.zone
    //+1 force to Other cards in zone

  }

  def closeBond(): Unit = {
//    if name on other card in same side of field of the zone x2 all strenghts
  }
}