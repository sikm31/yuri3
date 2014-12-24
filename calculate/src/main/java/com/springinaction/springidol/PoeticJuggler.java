package com.springinaction.springidol;

/**
 * Created by y.voytovich on 24.12.2014.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem){ //Внедрение поэмы
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem){
        super(beanBags);
        this.poem = poem;
    }

    public void perform() throws PerformanceException{
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}
