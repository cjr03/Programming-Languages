//
//  vegetable.h
//  HW4P2Roberts
//
//  Created by Cole Roberts on 2/7/24.
//

#ifndef vegetable_h
#define vegetable_h

#include "food.hpp"

using namespace std;

class Vegetable: virtual public Food {
private:
    Date exp;
public:
    Vegetable( ) : Food( ) { exp = Date(); cout << "Default Vegetable Constructor\n"; }
    Vegetable(string name_, Date expon): Food(name_) { exp = expon; cout << "Vegetable Constructor\n"; }
    Date expireTime( ) { return exp; }
};

#endif /* vegetable_h */
