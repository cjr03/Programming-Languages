//
//  main.cpp
//  HW4P2Roberts
//
//  Created by Cole Roberts on 2/6/24.
//

#include <iostream>

#include "tomato.h"

using namespace std;

int main(int argc, const char * argv[]) {
    Tomato baseconstruct = Tomato();
    Tomato testconstruct = Tomato("Tester", Date(2, 10, 2024), Date(2, 24, 2024));
    cout << "Default is ripe on " << baseconstruct.ripeTime().getDate() << " and expires on " << baseconstruct.expireTime().getDate() << ", which is when we should "<< baseconstruct.prepare() << endl;
    cout << "Test is ripe on " << testconstruct.ripeTime().getDate() << " and expires on " << testconstruct.expireTime().getDate() << ", which is when we should " << testconstruct.prepare() << endl;
    return 0;
}
