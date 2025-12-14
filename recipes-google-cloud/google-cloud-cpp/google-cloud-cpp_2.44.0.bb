DESCRIPTION = "C++ Client Libraries for Google Cloud Services"
AUTHOR = "Google Inc."
HOMEPAGE = "https://cloud.google.com/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "\
    git://github.com/googleapis/google-cloud-cpp.git;protocol=https;branch=main;rev=9bf698539a8857fcec20f05692d4aab492856f19;name=main \
    git://github.com/googleapis/googleapis.git;protocol=https;branch=master;rev=8cd3749f4b98f2eeeef511c16431979aeb3a6502;destsuffix=git/external/googleapis/src/googleapis_download;name=googleapis \
    file://0001-Remove-compiler-flags-from-build-info.patch \
    file://0002-Avoid-downloading-googleapis.patch \
"

SRCREV_FORMAT = "main"

include ${BPN}.inc

