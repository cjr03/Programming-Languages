//
//  food.hpp
//  HW4P2Roberts
//
//  Created by Cole Roberts on 2/6/24.
//

#ifndef food_hpp
#define food_hpp

#include <stdio.h>
#include <iostream>
#include <string>

using namespace std;

class Food {
private:
    string name;
public:
    Food( ){ name = "Food"; cout << "Default Food Constructor\n"; }
    Food(string name_){ name = name_; cout << "Food Constructor\n"; }
    virtual string prepare( ) { return "Prepare the " + name; }
};

class Date {
private:
    int year;
    int month;
    int day;
public:
    Date( ){ month = 1; day = 1; year = 1970; }
    Date(int m, int d, int y){ month = m; day = d; year = y; }
    string getDate( ){ return to_string(month) + "/" + to_string(day) + "/" + to_string(year); }
};

#endif /* food_hpp */
