package com.uncleScrooge.investment;

import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
public class VerificationTest {
    @Test
    public void should_return_true_when_service_package_access_only_by_controller_package(){
        classes()
                .that()
                .areAnnotatedWith("Service")
                .or()
                .haveNameMatching("Service")
                .should()
                .onlyBeAccessed()
                .byAnyPackage("Controller");
    }

    @Test
    public void should_return_true_when_domain_package_access_only_by_service_package(){
        classes()
                .that()
                .areAnnotatedWith("domain")
                .or()
                .haveNameMatching("domain")
                .should()
                .onlyBeAccessed()
                .byAnyPackage("Service");
    }
}
