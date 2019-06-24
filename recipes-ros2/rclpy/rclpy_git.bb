SUMMARY = "Package containing the Python client."
HOMEPAGE = "https://github.com/ros2/rclpy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
        python-cmake-module \
        rcl \
"

SRCREV = "5e0b2c181fd2f724873fc1294092f1a30321fb6c"
SRC_URI = "git://github.com/ros2/rclpy.git;protocol=git;"

RDEPENDS_${PN} += "${PYTHON_PN}-multiprocessing"

inherit ament
