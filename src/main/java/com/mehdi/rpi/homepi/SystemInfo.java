package com.mehdi.rpi.homepi;

import com.pi4j.system.NetworkInfo;

import java.io.IOException;
import java.text.ParseException;

/**
 * Created by Mehdi on 05/07/2015.
 */
public class SystemInfo {

    public void call() throws InterruptedException, IOException,
            ParseException {

        // display a few of the available system information properties
        System.out.println("----------------------------------------------------");
        System.out.println("HARDWARE INFO");
        System.out.println("----------------------------------------------------");
        System.out.println("Serial Number     :  " + com.pi4j.system.SystemInfo.getSerial());
        System.out.println("CPU Revision      :  " + com.pi4j.system.SystemInfo.getCpuRevision());
        System.out.println("CPU Architecture  :  " + com.pi4j.system.SystemInfo.getCpuArchitecture());
        System.out.println("CPU Part          :  " + com.pi4j.system.SystemInfo.getCpuPart());
        System.out.println("CPU Temperature   :  " + com.pi4j.system.SystemInfo.getCpuTemperature());
        System.out.println("CPU Core Voltage  :  " + com.pi4j.system.SystemInfo.getCpuVoltage());
        System.out.println("CPU Model Name    :  " + com.pi4j.system.SystemInfo.getModelName());
        System.out.println("Processor         :  " + com.pi4j.system.SystemInfo.getProcessor());
        System.out.println("Hardware Revision :  " + com.pi4j.system.SystemInfo.getRevision());
        System.out.println("Is Hard Float ABI :  " + com.pi4j.system.SystemInfo.isHardFloatAbi());
        System.out.println("Board Type        :  " + com.pi4j.system.SystemInfo.getBoardType().name());

        System.out.println("----------------------------------------------------");
        System.out.println("MEMORY INFO");
        System.out.println("----------------------------------------------------");
        System.out.println("Total Memory      :  " + com.pi4j.system.SystemInfo.getMemoryTotal());
        System.out.println("Used Memory       :  " + com.pi4j.system.SystemInfo.getMemoryUsed());
        System.out.println("Free Memory       :  " + com.pi4j.system.SystemInfo.getMemoryFree());
        System.out.println("Shared Memory     :  " + com.pi4j.system.SystemInfo.getMemoryShared());
        System.out.println("Memory Buffers    :  " + com.pi4j.system.SystemInfo.getMemoryBuffers());
        System.out.println("Cached Memory     :  " + com.pi4j.system.SystemInfo.getMemoryCached());
        System.out.println("SDRAM_C Voltage   :  " + com.pi4j.system.SystemInfo.getMemoryVoltageSDRam_C());
        System.out.println("SDRAM_I Voltage   :  " + com.pi4j.system.SystemInfo.getMemoryVoltageSDRam_I());
        System.out.println("SDRAM_P Voltage   :  " + com.pi4j.system.SystemInfo.getMemoryVoltageSDRam_P());

        System.out.println("----------------------------------------------------");
        System.out.println("OPERATING SYSTEM INFO");
        System.out.println("----------------------------------------------------");
        System.out.println("OS Name           :  " + com.pi4j.system.SystemInfo.getOsName());
        System.out.println("OS Version        :  " + com.pi4j.system.SystemInfo.getOsVersion());
        System.out.println("OS Architecture   :  " + com.pi4j.system.SystemInfo.getOsArch());
        System.out.println("OS Firmware Build :  " + com.pi4j.system.SystemInfo.getOsFirmwareBuild());
        System.out.println("OS Firmware Date  :  " + com.pi4j.system.SystemInfo.getOsFirmwareDate());

        System.out.println("----------------------------------------------------");
        System.out.println("JAVA ENVIRONMENT INFO");
        System.out.println("----------------------------------------------------");
        System.out.println("Java Vendor       :  " + com.pi4j.system.SystemInfo.getJavaVendor());
        System.out.println("Java Vendor URL   :  " + com.pi4j.system.SystemInfo.getJavaVendorUrl());
        System.out.println("Java Version      :  " + com.pi4j.system.SystemInfo.getJavaVersion());
        System.out.println("Java VM           :  " + com.pi4j.system.SystemInfo.getJavaVirtualMachine());
        System.out.println("Java Runtime      :  " + com.pi4j.system.SystemInfo.getJavaRuntime());

        System.out.println("----------------------------------------------------");
        System.out.println("NETWORK INFO");
        System.out.println("----------------------------------------------------");

        // display some of the network information
        System.out.println("Hostname          :  " + NetworkInfo.getHostname());
        for (String ipAddress : NetworkInfo.getIPAddresses())
            System.out.println("IP Addresses      :  " + ipAddress);
        for (String fqdn : NetworkInfo.getFQDNs())
            System.out.println("FQDN              :  " + fqdn);
        for (String nameserver : NetworkInfo.getNameservers())
            System.out.println("Nameserver        :  " + nameserver);

        System.out.println("----------------------------------------------------");
        System.out.println("CODEC INFO");
        System.out.println("----------------------------------------------------");
        System.out.println("H264 Codec Enabled:  " + com.pi4j.system.SystemInfo.getCodecH264Enabled());
        System.out.println("MPG2 Codec Enabled:  " + com.pi4j.system.SystemInfo.getCodecMPG2Enabled());
        System.out.println("WVC1 Codec Enabled:  " + com.pi4j.system.SystemInfo.getCodecWVC1Enabled());

        System.out.println("----------------------------------------------------");
        System.out.println("CLOCK INFO");
        System.out.println("----------------------------------------------------");
        System.out.println("ARM Frequency     :  " + com.pi4j.system.SystemInfo.getClockFrequencyArm());
        System.out.println("CORE Frequency    :  " + com.pi4j.system.SystemInfo.getClockFrequencyCore());
        System.out.println("H264 Frequency    :  " + com.pi4j.system.SystemInfo.getClockFrequencyH264());
        System.out.println("ISP Frequency     :  " + com.pi4j.system.SystemInfo.getClockFrequencyISP());
        System.out.println("V3D Frequency     :  " + com.pi4j.system.SystemInfo.getClockFrequencyV3D());
        System.out.println("UART Frequency    :  " + com.pi4j.system.SystemInfo.getClockFrequencyUART());
        System.out.println("PWM Frequency     :  " + com.pi4j.system.SystemInfo.getClockFrequencyPWM());
        System.out.println("EMMC Frequency    :  " + com.pi4j.system.SystemInfo.getClockFrequencyEMMC());
        System.out.println("Pixel Frequency   :  " + com.pi4j.system.SystemInfo.getClockFrequencyPixel());
        System.out.println("VEC Frequency     :  " + com.pi4j.system.SystemInfo.getClockFrequencyVEC());
        System.out.println("HDMI Frequency    :  " + com.pi4j.system.SystemInfo.getClockFrequencyHDMI());
        System.out.println("DPI Frequency     :  " + com.pi4j.system.SystemInfo.getClockFrequencyDPI());


        System.out.println();
        System.out.println();
    }
}
