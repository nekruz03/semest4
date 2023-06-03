#ifndef COMP_MATH2_CHORDMETHOD_H
#define COMP_MATH2_CHORDMETHOD_H
#include <functional>
#include "../util/AnsStruct.h"

#include "../CompMethodAbstr.h"
class ChordMethod : public CompMethodAbstr  {
public:
    Ans get_root(const std::function<double(double)>& func, double left, double right) override;
};


#endif //COMP_MATH2_CHORDMETHOD_H
