SUMMARY = "Package containing various utility types and functions for C."
HOMEPAGE = "https://github.com/ros2/rcutils"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
        python3-empy \
        python3-empy-native \
"

SRCREV = "ea283cb8c2bd12bc279c9ea60eded5aae9cc02ad"
SRC_URI = "git://github.com/ros2/rcutils.git;protocol=git;"

inherit ament

S = "${WORKDIR}/git"
