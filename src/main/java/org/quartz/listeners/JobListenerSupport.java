/* 
 * Copyright 2001-2009 Terracotta, Inc. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not 
 * use this file except in compliance with the License. You may obtain a copy 
 * of the License at 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 *   
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 */
package org.quartz.listeners;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

/**
 * A helpful abstract base class for implementors of 
 * <code>{@link org.quartz.JobListener}</code>.
 * 
 * <p>
 * The methods in this class are empty so you only need to override the  
 * subset for the <code>{@link org.quartz.JobListener}</code> events
 * you care about.
 * </p>
 * 
 * <p>
 * You are required to implement <code>{@link org.quartz.JobListener#getName()}</code> 
 * to return the unique name of your <code>JobListener</code>.  
 * </p>
 * 
 * @see org.quartz.JobListener
 */
public abstract class JobListenerSupport implements JobListener {

    public void jobToBeExecuted(JobExecutionContext context) {
    }

    public void jobExecutionVetoed(JobExecutionContext context) {
    }

    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
    }
}
