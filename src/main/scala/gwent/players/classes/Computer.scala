package cl.uchile.dcc
package gwent.players.classes

import gwent.cards.classes.units.{CloseCombat, Siege}
import gwent.cards.classes.weathers.{BitingFrost, ClearWeather, ImpenetrableMist, TorrentialRain}
import gwent.field.Deck
import gwent.players.AbstractPlayer

import cl.uchile.dcc.gwent.field.zones.Hand

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/** The computer in the game playing against a player has defined its name and deck.
 *
 * @constructor Initializes the gems, deck and name "COM".
 */
class Computer extends AbstractPlayer {

  val name: String = "COM"

  var deck: Deck = ArrayBuffer(
    new CloseCombat("Close Combat", 1),
    new Range("Range", 2),
    new Siege("Siege", 3),
    new CloseCombat("Close Combat Eff", 1, 1),
    new Range("Range Eff", 2, 1),
    new Siege("Siege Eff", 3, 1),
    new ClearWeather("Clima Despejado"),
    new ImpenetrableMist("Niebla Impenetrable"),
    new BitingFrost("Escarcha Mordiente"),
    new TorrentialRain(this))
}