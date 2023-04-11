package cl.uchile.dcc
package gwent

trait Jugador{
      private val nombre: str
      var Gemas: int = 2

      def jugarCarta(): Unit
      def robarCarta(): Unit
}
class Usuario(playername: str) extends Jugador{
      private val nombre: str= playername
      var Gemas:int = 2

      def jugarCarta():
            pass
      def robarCarta():
      pass
}
