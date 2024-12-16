//
//  orange.h
//  HW4P2Roberts
//
//  Created by Cole Roberts on 2/6/24.
//

#ifndef orange_h
#define orange_h

#include "fruit.hpp"

class Orange: public Fruit {   
public:
    Orange( ): Fruit("Orange", Date()) { cout << "Default Orange Constructor\n"; }
    Orange(Date ripeon): Fruit("Orange", ripeon){ cout << "Orange Constructor\n"; }
    void prepare( ){ cout << "Peel the orange"; }
}


#endif /* orange_h */
