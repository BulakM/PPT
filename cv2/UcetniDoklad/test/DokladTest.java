/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ucetnidoklad.VypoctenyDoklad;

/**
 *
 * @author janous11
 */
public class DokladTest {
    
    public DokladTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /**
     * Test 
     */
    @Test
    public void TestDPH(){
        System.out.println("Test vypoctu DPH a celkove ceny");
        
        int cisloDokladu = 123;
        float celkemBezDph = 100;
        int procentoDph = 21;
        VypoctenyDoklad instance = new VypoctenyDoklad(cisloDokladu,celkemBezDph,procentoDph);
        float CekaneDPH = 21;
        float CekanaCena = 121;    
        float VypocteneDPH = instance.getDph();
        float VypoctenaCena = instance.getCelkemSDph();   
        assertEquals(CekaneDPH,VypocteneDPH,0.0);
        assertEquals(CekanaCena,VypoctenaCena,0.0);
        
        celkemBezDph = 100;
        procentoDph = 0;
        CekaneDPH = 0;
        CekanaCena = 100;
        instance = new VypoctenyDoklad(cisloDokladu,celkemBezDph,procentoDph);
        VypocteneDPH = instance.getDph();
        VypoctenaCena = instance.getCelkemSDph();
        assertEquals(CekaneDPH,VypocteneDPH,0.0);
        assertEquals(CekanaCena,VypoctenaCena,0.0);
        
        celkemBezDph = 0;
        procentoDph = 21;
        CekaneDPH = 0;
        CekanaCena = 0;
        instance = new VypoctenyDoklad(cisloDokladu,celkemBezDph,procentoDph);
        VypocteneDPH = instance.getDph();
        VypoctenaCena = instance.getCelkemSDph();
        assertEquals(CekaneDPH,VypocteneDPH,0.0);
        assertEquals(CekanaCena,VypoctenaCena,0.0);
        
    }
    
}
