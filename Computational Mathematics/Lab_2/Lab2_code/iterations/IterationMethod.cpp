#include "IterationMethod.h"
using  namespace  std;
vector<double> IterationMethod::solve_system(vector<function<double(vector<double>)>> system, double precision) {
    vector<double> ans = std::vector<double>(system.size());
    fill(ans.begin(), ans.end(),1);
    vector<double> buf = ans;
    bool need_iter = true;
    while (need_iter) {
        need_iter = false;
        for (int i = 0; i < system.size(); i++) {
            buf[i] = system[i](ans);
            if(abs(buf[i] - ans[i]) > precision) need_iter = true;
        }
        ans = buf;
    }
    return ans;
}
