package com.springboot.demo.banner;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

public class CustomBanner implements Banner {

    public static final String BANNER = "  /$$$$$$   /$$$$$$  /$$$$$$$  /$$   /$$       /$$$$$$ /$$$$$$$$ /$$$$$$   /$$$$$$  /$$     /$$ /$$$$$$   /$$$$$$  /$$     /$$\n" +
            " /$$__  $$ /$$__  $$| $$__  $$| $$$ | $$      |_  $$_/|__  $$__//$$__  $$ /$$__  $$|  $$   /$$//$$__  $$ /$$__  $$|  $$   /$$/\n" +
            "| $$  \\__/| $$  \\__/| $$  \\ $$| $$$$| $$        | $$     | $$  | $$  \\__/| $$  \\ $$ \\  $$ /$$/| $$  \\__/| $$  \\ $$ \\  $$ /$$/ \n" +
            "| $$      |  $$$$$$ | $$  | $$| $$ $$ $$ /$$$$$$| $$     | $$  |  $$$$$$ | $$$$$$$$  \\  $$$$/ |  $$$$$$ | $$$$$$$$  \\  $$$$/  \n" +
            "| $$       \\____  $$| $$  | $$| $$  $$$$|______/| $$     | $$   \\____  $$| $$__  $$   \\  $$/   \\____  $$| $$__  $$   \\  $$/   \n" +
            "| $$    $$ /$$  \\ $$| $$  | $$| $$\\  $$$        | $$     | $$   /$$  \\ $$| $$  | $$    | $$    /$$  \\ $$| $$  | $$    | $$    \n" +
            "|  $$$$$$/|  $$$$$$/| $$$$$$$/| $$ \\  $$       /$$$$$$   | $$  |  $$$$$$/| $$  | $$    | $$   |  $$$$$$/| $$  | $$    | $$    \n" +
            " \\______/  \\______/ |_______/ |__/  \\__/      |______/   |__/   \\______/ |__/  |__/    |__/    \\______/ |__/  |__/    |__/    \n";

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream printStream) {
        printStream.println(BANNER);
    }
}
