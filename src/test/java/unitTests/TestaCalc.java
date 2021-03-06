package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test(priority = 2)
    public void testarsomarDoisNumeros() {
        // 1 - Preparar - Configurar -Given -
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;


        //2 - Executar - When - Do
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        //3- Validar - Then - Assert
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\nO resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test(priority = 1)
    public void testarSubtrairDoisNumeros(){
        // 1 - Preparar - Configurar -Given -
        int num1 = 6;
        int num2 = 2;
        int resultadoEsperado = 4;


        //2 - Executar - When - Do
        int resultadoAtual = Calc.subtrairDoisNumeros(num1, num2);

        //3- Validar - Then - Assert
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\nO resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }
    @Test(priority = 3)
    public void testarMultiplicarDoisNumeros(){
        // 1 - Preparar - Configurar -Given -
        int num1 = 3;
        int num2 = 5;
        int resultadoEsperado = 15;


        //2 - Executar - When - Do
        int resultadoAtual = Calc.multiplicarDoisNumeros(num1, num2);

        //3- Validar - Then - Assert
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\nO resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }
    @Test(priority = 4)
    public void testarDividirDoisNumeros(){
        // 1 - Preparar - Configurar -Given -
        int num1 = 20;
        int num2 = 4;
        int resultadoEsperado = 5;


        //2 - Executar - When - Do
        int resultadoAtual = Calc.dividirDoisNumeros(num1, num2);

        //3- Validar - Then - Assert
        System.out.println("O resultado Esperado e " + resultadoEsperado + "\nO resultado Atual foi " + resultadoAtual);
        assertEquals(resultadoAtual, resultadoEsperado);
    }
}