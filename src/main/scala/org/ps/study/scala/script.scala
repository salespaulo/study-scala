// package
package org.ps.study.scala.script

// study scala
class StudyScala {
  // ## sintax and semantic
  class SintaxAndSemantic {
    // # variables
    def variables = {
      // imutable
      val imutable:Int = 10
      // mutable
      var mutable:Int = 10
      // condicional match to var/val
      val red = "RED"
      val isBlue = if ("BLUE".equals(red)) true else false
      
      var x = 0
      // while
      while (x < 10) {
        println(s"x= $x")
        x += 1
      }

      // for
      for (x <- 0 to 10) {
        println(s"x= $x")
      }
    }

    // classes
    class ClasseBasica(p1:String, p2:Int)

    // object == singleton
    object ObjectBasico

    // metodos/funcoes
    // def <nome>(<params>): <retorno>
    def m1(p1:Int, p2:String): Unit = println(s"$p1 / $p2")

    // strutural types 
    type StruturalTypes = {def close(): Unit}

    def processaEFecha[A <: StruturalTypes](recurso: A) {
      recurso.close()
    }

    //## orientacao a objetos em scala
    //# classes
    class Pessoa
    // * atributo privado
    class Aluno(nome: String)
    // * atributo imutavel publico
    class AlunoImutavel(val nome: String)
    // * atributo mutavel publico
    class AlunoMutavel(var nome: String)

    class CompanionObject(val name: String)

    // # companion object, the same of static method factory class in java
    object CompanionObject {
      def criarCompanionObject(nome: String): CompanionObject = {
        new CompanionObject(nome)
      }
    }

    // type inference -> val companionObject: CompanionObject
    val companionObject = CompanionObject.criarCompanionObject("paulo")

    
    
  }
}
