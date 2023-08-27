cmake_minimum_required(VERSION 3.24)
project(comp_math4)

set(CMAKE_CXX_STANDARD 17)

add_executable(comp_math4 main.cpp NewtonMethod.cpp NewtonMethod.h matplotlib.h)
find_package(PythonLibs REQUIRED)
include_directories(${PYTHON_INCLUDE_DIRS})
include_directories(/Library/Frameworks/Python.framework/Versions/3.11/lib/python3.11/site-packages/numpy/core/include)

target_link_libraries(comp_math4 ${PYTHON_LIBRARIES})