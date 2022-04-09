/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 09 18:55:21 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(842);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-158));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1);
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      aVLTree_Node0.height = (-1676);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      assertNotNull(aVLTree_Node1);
      
      aVLTree_Node1.right = aVLTree_Node0;
      assertEquals(1, aVLTree0.height());
      
      // Undeclared exception!
      try { 
        aVLTree0.delete(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert((-1));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-100));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(1);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.insert(2520);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete((-100));
      assertEquals(2, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert((-2021));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert((-1));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-100));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(1);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(2, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(2, aVLTree0.height());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1732);
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node((-1415));
      assertEquals((-1), aVLTree0.height());
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertNotNull(aVLTree_Node1);
      
      aVLTree_Node1.left = aVLTree_Node0;
      assertEquals((-1), aVLTree0.height());
      
      int int0 = aVLTree0.getBalance(aVLTree_Node1);
      assertEquals((-1), aVLTree0.height());
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert((-1177));
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      aVLTree_Node0.right = aVLTree_Node0;
      assertEquals(0, aVLTree0.height());
      
      // Undeclared exception!
      aVLTree0.find((-1040));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(842);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-158));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1);
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      aVLTree_Node0.left = aVLTree_Node0;
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      assertNotNull(aVLTree_Node1);
      
      aVLTree_Node1.right = aVLTree_Node0;
      assertEquals(1, aVLTree0.height());
      
      // Undeclared exception!
      aVLTree0.delete(842);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1732);
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals((-1), aVLTree0.height());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals((-1), aVLTree0.height());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert((-1797));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-1281));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-16));
      aVLTree0.insert(1479);
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-46));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-46));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-46));
      int int0 = aVLTree0.height();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1479);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(250);
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      assertNotNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-16));
      aVLTree0.insert(1479);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-2543));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1132));
      aVLTree0.insert((-1));
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
  }
}
