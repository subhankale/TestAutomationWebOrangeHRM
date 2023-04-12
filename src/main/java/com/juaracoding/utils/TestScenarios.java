package com.juaracoding.utils;

public enum TestScenarios {
    T1("User valid login into web HRM"),
    T2("User logout"),
    T3("User invalid login into web HRM"),
    T4("User empty field web HRM"),
    T5("Admin add candidate"),
    T6("Admin invalid add recruitment"),
    T7("Admin not enter expect format"),
    T8("Admin invalid add recruitment"),
    T9("Admin invalid add recruitment"),
    T10("Admin success add recruitment");
    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
