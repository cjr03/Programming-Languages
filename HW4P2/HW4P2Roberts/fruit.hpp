//
//  fruit.hpp
//  HW4P2Roberts
//
//  Created by Cole Roberts on 2/6/24.
//

#ifndef fruit_hpp
#define fruit_hpp

#include "food.hpp"
    
using namespace std;

class Fruit: virtual public Food {
private:
    Date ripe;
public:
    Fruit( ) : Food( ) { ripe = Date(); cout << "Default Fruit Constructor\n"; }
    Fruit(string name_, Date ripeon): Food(name_) { ripe = ripeon; cout << "Fruit Constructor\n"; }
    Date ripeTime( ) { return ripe; }
};
    
#endif /* fruit_hpp */
