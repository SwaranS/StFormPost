/*
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.swaran;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.conversion.annotations.Conversion;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;
import com.swaran.model.User;

/**
 * 
 */
@Conversion()
public class IndexAction extends ActionSupport {

    private static final long serialVersionUID = -8366209797454396351L;

    private static ArrayList<User> userlist;

    private User user;


    /**
     * Action method to display user list. Uses <code>userList</code> array
     * object defined as class level attribute to display list of users.
     * @return SUCCESS
     */

    public String list() {

        return SUCCESS;
    }

    /**
     * Action method to add new user. Read the user information
     * via <code>user</code> object defined as class level attribute.
     * @return SUCCESS if user is added successfully
     */
    public String add() {

        System.out.println("User:"+user);


        return SUCCESS;
    }

    public static ArrayList<User> getUserlist() {
        return userlist;
    }

    public static void setUserlist(ArrayList<User> userlist) {
        IndexAction.userlist = userlist;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }}
