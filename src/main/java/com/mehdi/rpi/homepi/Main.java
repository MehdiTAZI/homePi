/**
 * Created by Mehdi on 05/07/2015.
 */
/*
* RaspberryPI simple app
* */
package com.mehdi.rpi.homepi;

public class Main {
    public static void main(String[] args) throws Exception {

        for(String arg : args){
            if(arg.equals(AppOption.GPIO_CONTROL.name())) {
                new ControlGpioExample().call();
            }else if(arg.equals(AppOption.SYSTEM_INFO.name())) {
                new SystemInfo().call();
            }
        }
    }
}


