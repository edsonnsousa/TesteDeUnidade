package Teste;

import Model.Fracao;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import org.junit.Assert;
import org.junit.Test;

public class TesteFracao {

    @Test(expected = ValueException.class)
    public void Testar_fracao(){
        Fracao fracao =  new Fracao(4,0);

    }
    @Test
    public void Testar_soma(){
        Fracao fracaoSoma =  new Fracao(5,2);
        Fracao fracao2Soma =  new Fracao(2,2);
        Assert.assertEquals("7/2.0",fracaoSoma.soma(fracao2Soma));
    }

    @Test
    public void  Testar_diferenca(){
        Fracao fracao =  new Fracao(5,2);
        Fracao fracao2 =  new Fracao(2,2);
        Assert.assertEquals("3/2.0",fracao.diferenca(fracao2));
    }

    @Test
    public void Testar_divisao(){
        Fracao fracao =  new Fracao(10,5);
        Fracao fracao2 =  new Fracao(2,10);
        Assert.assertEquals("100/10",fracao.divisao(fracao2));
    }
    @Test
    public void Testar_multiplicacao(){
        Fracao fracao =  new Fracao(3,2);
        Fracao fracao2 =  new Fracao(2,2);
        Assert.assertEquals("6/4",fracao.multiplicacao(fracao2));
    }

   

   
}
