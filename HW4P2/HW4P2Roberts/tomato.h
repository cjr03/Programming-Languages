//
//  tomato.h
//  HW4P2Roberts
//
//  Created by Cole Roberts on 2/7/24.
//

#ifndef tomato_h
#define tomato_h

#include "fruit.hpp"
#include "vegetable.h"

class Tomato: public Fruit, public Vegetable {
public:
    Tomato( ): Fruit("Tomato", Date()), Vegetable("Tomato", Date()) { cout << "Default Tomato Constructor\n"; }
    Tomato(string name, Date ripe, Date exp): Fruit(name, ripe), Vegetable(name, exp), Food(name) { cout << "Tomato Constructor\n"; }
};


#endif /* tomato_h */
