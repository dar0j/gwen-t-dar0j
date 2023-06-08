package cl.uchile.dcc
package gwent.players.classes

import gwent.cards.classes.units.{CloseCombat, Range, Siege}
import gwent.cards.classes.weathers.{BitingFrost, ClearWeather, ImpenetrableMist, TorrentialRain}
import gwent.field.Deck
import gwent.field.zones.Hand
import gwent.players.AbstractPlayer

import scala.collection.mutable.ArrayBuffer

/** The player in the game playing against the computer.
 *
 * @param playername
 * @constructor Creates an user with playername as his name, also initializes a Deck and a Hand.
 */
class User(playername: String,
           mydeck: Deck = ArrayBuffer(
             new CloseCombat("Close Combat", 1),
             new Range("Range", 2),
             new Siege("Siege", 3),
             new CloseCombat("Close Combat Eff", 1, 1),
             new Range("Range Eff", 2, 1),
             new Siege("Siege Eff", 3, 1),
             new ClearWeather("Clima Despejado"),
             new ImpenetrableMist("Niebla Impenetrable"),
             new BitingFrost("Escarcha Mordiente"),
             new TorrentialRain(this)))
  extends AbstractPlayer {

  private val name: String = playername
  val deck: Deck = mydeck
}

