//
//  apple.hpp
//  HW4P2Roberts
//
//  Created by Cole Roberts on 2/6/24.
//

#ifndef apple_hpp
#define apple_hpp

#include "fruit.hpp"

class Apple: public Fruit {
public:
    Apple( ) : Fruit("Apple", Date()) { cout << "Default Apple Constructor\n"; }
    Apple(Date ripeon): Fruit("Apple", ripeon) { cout << "Apple Constructor\n"; }
    string prepare( ){ return "Core the apple"; }
}

#endif /* apple_hpp */
