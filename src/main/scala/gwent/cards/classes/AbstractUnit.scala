package cl.uchile.dcc
package gwent.cards.classes

import cl.uchile.dcc.gwent.cards.AbstractCard

/**Creates a Unit Card
 *
 * @param _name The name of the Unit card.
 * @param _force The given strength of this Unit card.
 * @param eff 0 if it isn't an effect card, 1 if it has moreleBooster, 2 if it has closeBond.
 * @constructor A Unit Card.
 */
abstract class AbstractUnit(_name: String,
                            _force: Int,
                            eff: Int = 0)
  extends AbstractCard(_name) {
  /** The Unit Card name is stored in this variable.*/
  val name: String = _name

  /** This variable represents the strength of the unit.*/
  var force: Int = _force

  /**
   * Applyes the effect of adding plus 1 to the force of all the other Units in the same Zone.
   *
   * @return Unit, but changes the field.
   */
  def moraleBooster(): Unit = {
//    z = this.zone
    //+1 force to Other cards in zone

  }

  def closeBond(): Unit = {
//    if name on other card in same side of field of the zone x2 all strenghts
  }
}