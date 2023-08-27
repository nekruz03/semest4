using  namespace  std;
#include "NewtonMethod.h"
vector<double> NewtonMethod::interpolate_by_newton(vector<double> x_axis, vector<double> y_axis) {
    int n = x_axis.size();
    vector<double> ans;
    for (int i = 0; i < n; i++) {
        if (i == 0) {
            ans.push_back(y_axis[ i]);
        } else {
            double d = diff(x_axis, y_axis, i + 1);
            ans.push_back(d);
        }
    }
    return ans;
}

double NewtonMethod::diff(vector<double> &x_axis, vector<double> &y_axis, int n) {
    double diveded_diff = 0;
    for (int j = 0; j < n; j++) {
        double buf = y_axis[j];
        for (int i = 0; i < n; i++) {
            if (i == j) continue;
            buf /= (x_axis[j] - x_axis[i]);
        }
        diveded_diff += buf;
    }
    return diveded_diff;
}

double NewtonMethod::calculate_in_point(vector<double> &coefficients, vector<double> &x_axis, double x) {

    double ans = 0;
    for (int i = 0; i < coefficients.size(); i++) {
        double buf = coefficients[i];
        for (int j = 0; j < i; j++) {
            buf *= (x - x_axis[j]);
        }
        ans += buf;
    }
    return ans;

}
