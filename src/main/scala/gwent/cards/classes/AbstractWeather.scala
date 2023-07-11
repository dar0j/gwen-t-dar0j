package cl.uchile.dcc
package gwent.cards.classes

import gwent.cards.AbstractCard

/** Creates the idea of a Weather Card.
 *
 * @param _name The name of the Weather card.
 * @constructor An abstract Weather Card.
 */
abstract class AbstractWeather(_name: String)
  extends AbstractCard(_name){

  val classification = "Weather"
}
