package com.example.spotlessbug;

public class Test {

  void foo() {
    String x = "asdlkasd;akas";
    String y =
        """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit,
                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum

                Lorem ipsum dolor sit amet, consectetur adipiscing elit,
                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum
                """;

    String z =
        """
                {
                    "name": "simple json"
                }
                """;

    String zz =
        """
                { "name"   : "Alice Brown",
                   "sku"    : "54321",
                   "price"  : 199.95,
                   "shipTo" : { "name" : "Bob Brown",
                                "address" : "456 Oak Lane",
                                "city" : "Pretendville",
                                "state" : "HI",
                                "zip"   : "98999" },
                   "billTo" : { "name" : "Alice Brown",
                                "address" : "456 Oak Lane",
                                "city" : "Pretendville",
                                "state" : "HI",
                                "zip"   : "98999" }
                 }
                """;
  }
}
