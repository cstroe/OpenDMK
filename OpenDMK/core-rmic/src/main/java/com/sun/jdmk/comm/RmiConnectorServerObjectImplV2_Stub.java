/*
 * @(#)RmiConnectorServerObjectImplV2_Stub.java	1.5
 *
 * 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU General
 * Public License Version 2 only ("GPL") or the Common Development and
 * Distribution License("CDDL")(collectively, the "License"). You may not use
 * this file except in compliance with the License. You can obtain a copy of the
 * License at http://opendmk.dev.java.net/legal_notices/licenses.txt or in the 
 * LEGAL_NOTICES folder that accompanied this code. See the License for the 
 * specific language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file found at
 *     http://opendmk.dev.java.net/legal_notices/licenses.txt
 * or in the LEGAL_NOTICES folder that accompanied this code.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.
 * 
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * 
 *       "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding
 * 
 *       "[Contributor] elects to include this software in this distribution
 *        under the [CDDL or GPL Version 2] license."
 * 
 * If you don't indicate a single choice of license, a recipient has the option
 * to distribute your version of this file under either the CDDL or the GPL
 * Version 2, or to extend the choice of license to its licensees as provided
 * above. However, if you add GPL Version 2 code and therefore, elected the
 * GPL Version 2 license, then the option applies only if the new code is made
 * subject to such option by the copyright holder.
 * 
 *
 */
// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package com.sun.jdmk.comm;

public final class RmiConnectorServerObjectImplV2_Stub
    extends java.rmi.server.RemoteStub
    implements com.sun.jdmk.comm.RmiConnectorServerObjectV2, java.rmi.Remote
{
    private static final long serialVersionUID = -6517319243695058671L;
    
    private static java.lang.reflect.Method $method_createMBean_0;
    private static java.lang.reflect.Method $method_createMBean_1;
    private static java.lang.reflect.Method $method_createMBean_2;
    private static java.lang.reflect.Method $method_createMBean_3;
    private static java.lang.reflect.Method $method_getAttribute_4;
    private static java.lang.reflect.Method $method_getAttributes_5;
    private static java.lang.reflect.Method $method_getDefaultDomain_6;
    private static java.lang.reflect.Method $method_getMBeanCount_7;
    private static java.lang.reflect.Method $method_getMBeanInfo_8;
    private static java.lang.reflect.Method $method_getObjectInstance_9;
    private static java.lang.reflect.Method $method_invoke_10;
    private static java.lang.reflect.Method $method_isInstanceOf_11;
    private static java.lang.reflect.Method $method_isRegistered_12;
    private static java.lang.reflect.Method $method_pingHeartBeatServer_13;
    private static java.lang.reflect.Method $method_queryMBeans_14;
    private static java.lang.reflect.Method $method_queryNames_15;
    private static java.lang.reflect.Method $method_remoteRequest_16;
    private static java.lang.reflect.Method $method_setAttribute_17;
    private static java.lang.reflect.Method $method_setAttributes_18;
    private static java.lang.reflect.Method $method_unregisterMBean_19;
    
    static {
	try {
	    $method_createMBean_0 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("createMBean", new java.lang.Class[] {java.lang.String.class, javax.management.ObjectName.class, com.sun.jdmk.OperationContext.class});
	    $method_createMBean_1 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("createMBean", new java.lang.Class[] {java.lang.String.class, javax.management.ObjectName.class, javax.management.ObjectName.class, com.sun.jdmk.OperationContext.class});
	    $method_createMBean_2 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("createMBean", new java.lang.Class[] {java.lang.String.class, javax.management.ObjectName.class, javax.management.ObjectName.class, java.lang.Object[].class, java.lang.String[].class, com.sun.jdmk.OperationContext.class});
	    $method_createMBean_3 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("createMBean", new java.lang.Class[] {java.lang.String.class, javax.management.ObjectName.class, java.lang.Object[].class, java.lang.String[].class, com.sun.jdmk.OperationContext.class});
	    $method_getAttribute_4 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("getAttribute", new java.lang.Class[] {javax.management.ObjectName.class, java.lang.String.class, com.sun.jdmk.OperationContext.class});
	    $method_getAttributes_5 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("getAttributes", new java.lang.Class[] {javax.management.ObjectName.class, java.lang.String[].class, com.sun.jdmk.OperationContext.class});
	    $method_getDefaultDomain_6 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("getDefaultDomain", new java.lang.Class[] {com.sun.jdmk.OperationContext.class});
	    $method_getMBeanCount_7 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("getMBeanCount", new java.lang.Class[] {com.sun.jdmk.OperationContext.class});
	    $method_getMBeanInfo_8 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("getMBeanInfo", new java.lang.Class[] {javax.management.ObjectName.class, com.sun.jdmk.OperationContext.class});
	    $method_getObjectInstance_9 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("getObjectInstance", new java.lang.Class[] {javax.management.ObjectName.class, com.sun.jdmk.OperationContext.class});
	    $method_invoke_10 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("invoke", new java.lang.Class[] {javax.management.ObjectName.class, java.lang.String.class, java.lang.Object[].class, java.lang.String[].class, com.sun.jdmk.OperationContext.class});
	    $method_isInstanceOf_11 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("isInstanceOf", new java.lang.Class[] {javax.management.ObjectName.class, java.lang.String.class, com.sun.jdmk.OperationContext.class});
	    $method_isRegistered_12 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("isRegistered", new java.lang.Class[] {javax.management.ObjectName.class, com.sun.jdmk.OperationContext.class});
	    $method_pingHeartBeatServer_13 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("pingHeartBeatServer", new java.lang.Class[] {java.lang.String.class, int.class, int.class, java.lang.Long.class, com.sun.jdmk.OperationContext.class});
	    $method_queryMBeans_14 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("queryMBeans", new java.lang.Class[] {javax.management.ObjectName.class, javax.management.QueryExp.class, com.sun.jdmk.OperationContext.class});
	    $method_queryNames_15 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("queryNames", new java.lang.Class[] {javax.management.ObjectName.class, javax.management.QueryExp.class, com.sun.jdmk.OperationContext.class});
	    $method_remoteRequest_16 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("remoteRequest", new java.lang.Class[] {int.class, java.lang.Object[].class, com.sun.jdmk.OperationContext.class});
	    $method_setAttribute_17 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("setAttribute", new java.lang.Class[] {javax.management.ObjectName.class, javax.management.Attribute.class, com.sun.jdmk.OperationContext.class});
	    $method_setAttributes_18 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("setAttributes", new java.lang.Class[] {javax.management.ObjectName.class, javax.management.AttributeList.class, com.sun.jdmk.OperationContext.class});
	    $method_unregisterMBean_19 = com.sun.jdmk.comm.RmiConnectorServerObjectV2.class.getMethod("unregisterMBean", new java.lang.Class[] {javax.management.ObjectName.class, com.sun.jdmk.OperationContext.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public RmiConnectorServerObjectImplV2_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of createMBean(String, ObjectName, OperationContext)
    public javax.management.ObjectInstance createMBean(java.lang.String $param_String_1, javax.management.ObjectName $param_ObjectName_2, com.sun.jdmk.OperationContext $param_OperationContext_3)
	throws java.rmi.RemoteException, javax.management.InstanceAlreadyExistsException, javax.management.MBeanException, javax.management.MBeanRegistrationException, javax.management.NotCompliantMBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_createMBean_0, new java.lang.Object[] {$param_String_1, $param_ObjectName_2, $param_OperationContext_3}, 2440010322598766993L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceAlreadyExistsException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.NotCompliantMBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of createMBean(String, ObjectName, ObjectName, OperationContext)
    public javax.management.ObjectInstance createMBean(java.lang.String $param_String_1, javax.management.ObjectName $param_ObjectName_2, javax.management.ObjectName $param_ObjectName_3, com.sun.jdmk.OperationContext $param_OperationContext_4)
	throws java.rmi.RemoteException, javax.management.InstanceAlreadyExistsException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.MBeanRegistrationException, javax.management.NotCompliantMBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_createMBean_1, new java.lang.Object[] {$param_String_1, $param_ObjectName_2, $param_ObjectName_3, $param_OperationContext_4}, 2169275250666070156L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceAlreadyExistsException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.NotCompliantMBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of createMBean(String, ObjectName, ObjectName, Object[], String[], OperationContext)
    public javax.management.ObjectInstance createMBean(java.lang.String $param_String_1, javax.management.ObjectName $param_ObjectName_2, javax.management.ObjectName $param_ObjectName_3, java.lang.Object[] $param_arrayOf_Object_4, java.lang.String[] $param_arrayOf_String_5, com.sun.jdmk.OperationContext $param_OperationContext_6)
	throws java.rmi.RemoteException, javax.management.InstanceAlreadyExistsException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.MBeanRegistrationException, javax.management.NotCompliantMBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_createMBean_2, new java.lang.Object[] {$param_String_1, $param_ObjectName_2, $param_ObjectName_3, $param_arrayOf_Object_4, $param_arrayOf_String_5, $param_OperationContext_6}, 5370333889440009947L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceAlreadyExistsException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.NotCompliantMBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of createMBean(String, ObjectName, Object[], String[], OperationContext)
    public javax.management.ObjectInstance createMBean(java.lang.String $param_String_1, javax.management.ObjectName $param_ObjectName_2, java.lang.Object[] $param_arrayOf_Object_3, java.lang.String[] $param_arrayOf_String_4, com.sun.jdmk.OperationContext $param_OperationContext_5)
	throws java.rmi.RemoteException, javax.management.InstanceAlreadyExistsException, javax.management.MBeanException, javax.management.MBeanRegistrationException, javax.management.NotCompliantMBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_createMBean_3, new java.lang.Object[] {$param_String_1, $param_ObjectName_2, $param_arrayOf_Object_3, $param_arrayOf_String_4, $param_OperationContext_5}, 977318789919612498L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceAlreadyExistsException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.NotCompliantMBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getAttribute(ObjectName, String, OperationContext)
    public java.lang.Object getAttribute(javax.management.ObjectName $param_ObjectName_1, java.lang.String $param_String_2, com.sun.jdmk.OperationContext $param_OperationContext_3)
	throws java.rmi.RemoteException, javax.management.AttributeNotFoundException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAttribute_4, new java.lang.Object[] {$param_ObjectName_1, $param_String_2, $param_OperationContext_3}, -410295849957453740L);
	    return ((java.lang.Object) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.AttributeNotFoundException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getAttributes(ObjectName, String[], OperationContext)
    public javax.management.AttributeList getAttributes(javax.management.ObjectName $param_ObjectName_1, java.lang.String[] $param_arrayOf_String_2, com.sun.jdmk.OperationContext $param_OperationContext_3)
	throws java.rmi.RemoteException, javax.management.InstanceNotFoundException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAttributes_5, new java.lang.Object[] {$param_ObjectName_1, $param_arrayOf_String_2, $param_OperationContext_3}, 3099299699664743513L);
	    return ((javax.management.AttributeList) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getDefaultDomain(OperationContext)
    public java.lang.String getDefaultDomain(com.sun.jdmk.OperationContext $param_OperationContext_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getDefaultDomain_6, new java.lang.Object[] {$param_OperationContext_1}, 512409007936098290L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getMBeanCount(OperationContext)
    public java.lang.Integer getMBeanCount(com.sun.jdmk.OperationContext $param_OperationContext_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getMBeanCount_7, new java.lang.Object[] {$param_OperationContext_1}, -3425292753612071307L);
	    return ((java.lang.Integer) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getMBeanInfo(ObjectName, OperationContext)
    public javax.management.MBeanInfo getMBeanInfo(javax.management.ObjectName $param_ObjectName_1, com.sun.jdmk.OperationContext $param_OperationContext_2)
	throws java.rmi.RemoteException, javax.management.InstanceNotFoundException, javax.management.IntrospectionException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_getMBeanInfo_8, new java.lang.Object[] {$param_ObjectName_1, $param_OperationContext_2}, 1921649590489468780L);
	    return ((javax.management.MBeanInfo) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.IntrospectionException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getObjectInstance(ObjectName, OperationContext)
    public javax.management.ObjectInstance getObjectInstance(javax.management.ObjectName $param_ObjectName_1, com.sun.jdmk.OperationContext $param_OperationContext_2)
	throws java.rmi.RemoteException, javax.management.InstanceNotFoundException
    {
	try {
	    Object $result = ref.invoke(this, $method_getObjectInstance_9, new java.lang.Object[] {$param_ObjectName_1, $param_OperationContext_2}, 4858459067333490289L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of invoke(ObjectName, String, Object[], String[], OperationContext)
    public java.lang.Object invoke(javax.management.ObjectName $param_ObjectName_1, java.lang.String $param_String_2, java.lang.Object[] $param_arrayOf_Object_3, java.lang.String[] $param_arrayOf_String_4, com.sun.jdmk.OperationContext $param_OperationContext_5)
	throws java.rmi.RemoteException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_invoke_10, new java.lang.Object[] {$param_ObjectName_1, $param_String_2, $param_arrayOf_Object_3, $param_arrayOf_String_4, $param_OperationContext_5}, 6940807516347053750L);
	    return ((java.lang.Object) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of isInstanceOf(ObjectName, String, OperationContext)
    public boolean isInstanceOf(javax.management.ObjectName $param_ObjectName_1, java.lang.String $param_String_2, com.sun.jdmk.OperationContext $param_OperationContext_3)
	throws java.rmi.RemoteException, javax.management.InstanceNotFoundException
    {
	try {
	    Object $result = ref.invoke(this, $method_isInstanceOf_11, new java.lang.Object[] {$param_ObjectName_1, $param_String_2, $param_OperationContext_3}, 260369099243055722L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of isRegistered(ObjectName, OperationContext)
    public boolean isRegistered(javax.management.ObjectName $param_ObjectName_1, com.sun.jdmk.OperationContext $param_OperationContext_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_isRegistered_12, new java.lang.Object[] {$param_ObjectName_1, $param_OperationContext_2}, -7609211420371661371L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of pingHeartBeatServer(String, int, int, Long, OperationContext)
    public java.lang.String pingHeartBeatServer(java.lang.String $param_String_1, int $param_int_2, int $param_int_3, java.lang.Long $param_Long_4, com.sun.jdmk.OperationContext $param_OperationContext_5)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_pingHeartBeatServer_13, new java.lang.Object[] {$param_String_1, new java.lang.Integer($param_int_2), new java.lang.Integer($param_int_3), $param_Long_4, $param_OperationContext_5}, 436319371904843320L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of queryMBeans(ObjectName, QueryExp, OperationContext)
    public java.util.Set queryMBeans(javax.management.ObjectName $param_ObjectName_1, javax.management.QueryExp $param_QueryExp_2, com.sun.jdmk.OperationContext $param_OperationContext_3)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_queryMBeans_14, new java.lang.Object[] {$param_ObjectName_1, $param_QueryExp_2, $param_OperationContext_3}, 3187052459013828740L);
	    return ((java.util.Set) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of queryNames(ObjectName, QueryExp, OperationContext)
    public java.util.Set queryNames(javax.management.ObjectName $param_ObjectName_1, javax.management.QueryExp $param_QueryExp_2, com.sun.jdmk.OperationContext $param_OperationContext_3)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_queryNames_15, new java.lang.Object[] {$param_ObjectName_1, $param_QueryExp_2, $param_OperationContext_3}, 7107001389539938448L);
	    return ((java.util.Set) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of remoteRequest(int, Object[], OperationContext)
    public java.lang.Object[] remoteRequest(int $param_int_1, java.lang.Object[] $param_arrayOf_Object_2, com.sun.jdmk.OperationContext $param_OperationContext_3)
	throws java.lang.Exception, java.rmi.RemoteException
    {
	Object $result = ref.invoke(this, $method_remoteRequest_16, new java.lang.Object[] {new java.lang.Integer($param_int_1), $param_arrayOf_Object_2, $param_OperationContext_3}, -2341243041480682483L);
	return ((java.lang.Object[]) $result);
    }
    
    // implementation of setAttribute(ObjectName, Attribute, OperationContext)
    public void setAttribute(javax.management.ObjectName $param_ObjectName_1, javax.management.Attribute $param_Attribute_2, com.sun.jdmk.OperationContext $param_OperationContext_3)
	throws java.rmi.RemoteException, javax.management.AttributeNotFoundException, javax.management.InstanceNotFoundException, javax.management.InvalidAttributeValueException, javax.management.MBeanException, javax.management.ReflectionException
    {
	try {
	    ref.invoke(this, $method_setAttribute_17, new java.lang.Object[] {$param_ObjectName_1, $param_Attribute_2, $param_OperationContext_3}, 771897399327456434L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.AttributeNotFoundException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.InvalidAttributeValueException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of setAttributes(ObjectName, AttributeList, OperationContext)
    public javax.management.AttributeList setAttributes(javax.management.ObjectName $param_ObjectName_1, javax.management.AttributeList $param_AttributeList_2, com.sun.jdmk.OperationContext $param_OperationContext_3)
	throws java.rmi.RemoteException, javax.management.InstanceNotFoundException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_setAttributes_18, new java.lang.Object[] {$param_ObjectName_1, $param_AttributeList_2, $param_OperationContext_3}, -1801622868570705949L);
	    return ((javax.management.AttributeList) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of unregisterMBean(ObjectName, OperationContext)
    public void unregisterMBean(javax.management.ObjectName $param_ObjectName_1, com.sun.jdmk.OperationContext $param_OperationContext_2)
	throws java.rmi.RemoteException, javax.management.InstanceNotFoundException, javax.management.MBeanRegistrationException
    {
	try {
	    ref.invoke(this, $method_unregisterMBean_19, new java.lang.Object[] {$param_ObjectName_1, $param_OperationContext_2}, 1828313826367654983L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanRegistrationException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}