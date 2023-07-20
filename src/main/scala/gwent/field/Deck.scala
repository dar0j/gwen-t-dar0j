package cl.uchile.dcc
package gwent.field

import gwent.cards.{ICard, NullCard}

import scala.util.Random

class Deck {
  private var deck: List[ICard] = List[ICard](
    NullCard, NullCard, NullCard, NullCard, NullCard,
    NullCard, NullCard, NullCard, NullCard, NullCard,
    NullCard, NullCard, NullCard, NullCard, NullCard,
    NullCard, NullCard, NullCard, NullCard, NullCard,
    NullCard, NullCard, NullCard, NullCard, NullCard
  )
  def shuffle(): Unit = {
    deck = Random.shuffle(deck)
  }
}
/*
ArrayBuffer(
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

  pc
  List(
    new CloseCombat("Close Combat", 1),
    new Range("Range", 2),
    new Siege("Siege", 3),
    new CloseCombat("Close Combat Eff", 1, 1),
    new Range("Range Eff", 2, 1),
    new Siege("Siege Eff", 3, 1),
    new ClearWeather("Clima Despejado"),
    new ImpenetrableMist("Niebla Impenetrable"),
    new BitingFrost("Escarcha Mordiente"),
    new TorrentialRain(this))*/
