fun main() {
    val Eclairage = AmpouleIncandescente();

    var nbCycles = 0;
    do{
        Eclairage.allumer();
        while(Eclairage.etat() > 0 ){
            Eclairage.diminuer();
        }
        println(Eclairage.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && Eclairage.etat() != -1);
    println("nombre de cycles "+nbCycles);
}