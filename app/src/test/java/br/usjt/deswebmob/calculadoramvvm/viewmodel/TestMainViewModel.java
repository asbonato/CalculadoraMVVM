package br.usjt.deswebmob.calculadoramvvm.viewmodel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestMainViewModel {
    private MainViewModel viewModel;


    @Before
    public void setup() {
        viewModel = new MainViewModel();
    }

    @Test
    public void testeCalculo(){
        viewModel.valor1.set("1");
        viewModel.valor2.set("2");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("3",viewModel.resultado.get());

        viewModel.valor1.set("1");
        viewModel.valor2.set("2");
        viewModel.operador.set("*");
        viewModel.calcular();
        assertEquals("2",viewModel.resultado.get());

        viewModel.valor1.set("1");
        viewModel.valor2.set("2");
        viewModel.operador.set("-");
        viewModel.calcular();
        assertEquals("-1",viewModel.resultado.get());

        viewModel.valor1.set("1");
        viewModel.valor2.set("2");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals("0",viewModel.resultado.get());

        viewModel.valor1.set("2");
        viewModel.valor2.set("1");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("3",viewModel.resultado.get());

        viewModel.valor1.set("2");
        viewModel.valor2.set("1");
        viewModel.operador.set("*");
        viewModel.calcular();
        assertEquals("2",viewModel.resultado.get());

        viewModel.valor1.set("2");
        viewModel.valor2.set("1");
        viewModel.operador.set("-");
        viewModel.calcular();
        assertEquals("1",viewModel.resultado.get());

        viewModel.valor1.set("2");
        viewModel.valor2.set("1");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals("2",viewModel.resultado.get());

        viewModel.valor1.set("1");
        viewModel.valor2.set("1");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("2",viewModel.resultado.get());

        viewModel.valor1.set("1");
        viewModel.valor2.set("1");
        viewModel.operador.set("*");
        viewModel.calcular();
        assertEquals("1",viewModel.resultado.get());

        viewModel.valor1.set("1");
        viewModel.valor2.set("1");
        viewModel.operador.set("-");
        viewModel.calcular();
        assertEquals("0",viewModel.resultado.get());

        viewModel.valor1.set("1");
        viewModel.valor2.set("1");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals("1",viewModel.resultado.get());

    }
}
