/*
 *  Copyright 2005 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.commons.proxy.provider;

import junit.framework.TestCase;
import org.apache.commons.proxy.exception.DelegateProviderException;

public class TestBeanProvider extends TestCase
{
    public void testAbstractBeanClass()
    {
        try
        {
            new BeanProvider( Number.class ).getDelegate();
            fail();
        }
        catch( DelegateProviderException e )
        {

        }
    }

    public void testNonAccessibleConstructor()
    {
        try
        {
            new BeanProvider( MyBean.class ).getDelegate();
            fail();
        }
        catch( DelegateProviderException e )
        {

        }
    }

    public static class MyBean
    {
        private MyBean()
        {

        }
    }
}