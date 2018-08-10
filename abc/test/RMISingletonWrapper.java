package com.abc.test;
/*package com.anz.test;

import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

public class RMISingletonWrapper {
	  private static RMISingletonWrapper instance = null;
	  private static String SINGLETON_JNDI_NAME = "RMISingleton";

	  public static RMISingletonWrapper getInstance() {
	    return instance;
	  }

	  // All methods in delegate the method call to the actual
	  // Singleton that lives on the clustered JNDI tree.
	  public void delegate() {
	    try {
	      RMISingleton singleton = getRMISingleton();
	      singleton.delegate();
	    } catch (Exception e) {
	      // Could try and recover
	      e.printStackTrace();
	    }
	  }

	  // Locate the true Singleton object in the cluster.
	  private RMISingleton getRMISingleton() {
	    RMISingleton rmiSingleton = null;
	    try {
	      Context jndiContext = new InitialContext();
	      Object obj = jndiContext.lookup(SINGLETON_JNDI_NAME);
	      rmiSingleton = (RMISingleton)PortableRemoteObject.narrow(
	        obj,
	        Class.forName("examples.singleton.rmi.RMISingleton"));
	    } catch (Exception e) {
	      // Could try and recover
	      e.printStackTrace();
	    }
	    return rmiSingleton;
	  }
	}
*/