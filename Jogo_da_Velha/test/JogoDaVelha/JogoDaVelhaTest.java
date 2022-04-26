/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package JogoDaVelha;

import javax.swing.JButton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alexandre
 */
public class JogoDaVelhaTest {
    
    public JogoDaVelhaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of mudar method, of class JogoDaVelha.
     */
    @Test
    public void testMudar() {
        System.out.println("mudar");
        JButton btn = null;
        JogoDaVelha instance = new JogoDaVelha();
        instance.mudar(btn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class JogoDaVelha.
     */
    @Test
    public void testAtualizar() {
        System.out.println("atualizar");
        JogoDaVelha instance = new JogoDaVelha();
        instance.atualizar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ganhou method, of class JogoDaVelha.
     */
    @Test
    public void testGanhou() {
        System.out.println("ganhou");
        JogoDaVelha instance = new JogoDaVelha();
        instance.ganhou();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpar method, of class JogoDaVelha.
     */
    @Test
    public void testLimpar() {
        System.out.println("limpar");
        JogoDaVelha instance = new JogoDaVelha();
        instance.limpar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class JogoDaVelha.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JogoDaVelha.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
